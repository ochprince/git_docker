package com.colasoft.docker_trial;

import com.colasoft.csf.common.api.CsfApi;
import com.colasoft.csf.common.api.CsfApiImpl;
import com.colasoft.csf.common.autoconfigure.annotations.EnableCsfModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableCsfModule
@SpringBootApplication
public class CsfDockerTrialApplication {

    public static void main(String[] args) {
        SpringApplication.run(CsfDockerTrialApplication.class, args);
        CsfApi csfApi = new CsfApiImpl();
        csfApi.initData();
    }
}
