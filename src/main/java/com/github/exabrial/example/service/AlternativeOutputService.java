package com.github.exabrial.example.service;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;

@ApplicationScoped
@Alternative
public class AlternativeOutputService implements OutputService {

	@Override
	public String run() {
		return "alternative";
	}
}
