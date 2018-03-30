package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.RelayStatusResponse;
import com.example.demo.service.RelayService;

@RestController
public class MainController {
	@Autowired
	RelayService relayService;

	@PostMapping("/get-relay-status")
	public RelayStatusResponse getRelayStatus(String deviceId) {
		return relayService.getRelayStatusResponse(deviceId);
	}

}
