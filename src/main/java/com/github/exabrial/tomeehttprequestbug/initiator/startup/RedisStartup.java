package com.github.exabrial.tomeehttprequestbug.initiator.startup;

import java.io.File;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;

import redis.embedded.RedisServer;

@ApplicationScoped
public class RedisStartup {
	private RedisServer redisServer;
	private final String redisServerBinary = "/opt/homebrew/bin/redis-server";

	public void observeStart(@Observes @Initialized(ApplicationScoped.class) final Object event) {
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("postConstruct() Starting Redis server:" + redisServerBinary);
		redisServer = new RedisServer(new File(redisServerBinary), 6379);
		redisServer.start();
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("preDestroy() Stopping Redis server...");
		redisServer.stop();
	}
}
