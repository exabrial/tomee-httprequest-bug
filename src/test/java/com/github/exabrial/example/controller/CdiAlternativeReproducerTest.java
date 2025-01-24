package com.github.exabrial.example.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.inject.Inject;

import org.apache.openwebbeans.junit5.Cdi;
import org.junit.jupiter.api.Test;

import com.github.exabrial.example.service.AlternativeOutputService;
import com.github.exabrial.example.service.DefaultOutputService;

@Cdi(
		disableDiscovery = true,
		classes = { CdiAlternativeReproducer.class, DefaultOutputService.class, AlternativeOutputService.class },
		alternatives = { AlternativeOutputService.class })
public class CdiAlternativeReproducerTest {
	@Inject
	private CdiAlternativeReproducer cdiAlternativeReproducer;

	@Test
	void cdiAlternativeTest() {
		final String actual = cdiAlternativeReproducer.run();
		final String expected = "alternative";
		assertEquals(expected, actual);
	}
}
