package com.hemebiotech.analytics.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface IAnalyticsCounterAndSort {
       Map<String, Integer> countSymptoms(List<String> symptoms) throws IOException;

      Map<String , Integer> sortSymptoms(Map<String, Integer> symptoms) throws IOException;

}