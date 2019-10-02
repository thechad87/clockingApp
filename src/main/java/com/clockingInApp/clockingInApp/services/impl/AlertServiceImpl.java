package com.clockingInApp.clockingInApp.services.impl;

import com.clockingInApp.clockingInApp.domain.Alerts.Alert;
import com.clockingInApp.clockingInApp.repository.AlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AlertServiceImpl {

    @Autowired
    private AlertRepository alertRepository;

    public List <Alert> getAllAlerts() {
        List <Alert> alerts = new ArrayList <>();
        alertRepository.findAll().forEach(alerts::add);
        return alerts;
    }

    public Alert getAlert(String id) {
        return alertRepository.findById(id).get();
    }

    public void addAlert(Alert alert) {
        alertRepository.save(alert);
    }

    public void updateAlert(String id, Alert alert) {
        alertRepository.save(alert);
    }

    public void deleteAlert(String id) {
        alertRepository.deleteById(id);
    }
}
