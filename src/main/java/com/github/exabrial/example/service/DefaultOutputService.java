package com.github.exabrial.example.service;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;

@ApplicationScoped
@Default
public class DefaultOutputService implements OutputService {

	@Override
	public String run() {
		return "default";
	}
}
