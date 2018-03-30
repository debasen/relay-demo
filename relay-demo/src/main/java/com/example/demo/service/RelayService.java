package com.example.demo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.RelayStatus;
import com.example.demo.model.RelayStatusResponse;
import com.example.demo.repository.RelayStatusRepository;

@Service
public class RelayService {

	@Autowired
	RelayStatusRepository relayStatusRepository;

	public RelayStatusResponse getRelayStatusResponse(String deviceId) {
		RelayStatusResponse relayStatusResponse = new RelayStatusResponse();
		RelayStatus relayStatus = relayStatusRepository.findOne(deviceId);
		BeanUtils.copyProperties(relayStatus, relayStatusResponse);
		return relayStatusResponse;
	}

}
