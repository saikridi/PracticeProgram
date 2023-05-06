package com.PracticePrograms.BusinessCalculationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public interface DataService {
    int[] retrieveData();
}
