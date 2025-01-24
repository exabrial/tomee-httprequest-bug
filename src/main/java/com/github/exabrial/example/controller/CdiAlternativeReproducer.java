package com.github.exabrial.example.controller;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.github.exabrial.example.service.OutputService;

@ApplicationScoped
public class CdiAlternativeReproducer {
	@Inject
	private OutputService outputService;

	public String run() {
		return outputService.run();
	}
}
