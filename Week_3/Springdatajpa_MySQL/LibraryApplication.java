package com.library;

import com.library.service.RegionService;
import com.library.model.Region;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class LibraryApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(LibraryApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(LibraryApplication.class, args);
        RegionService regionService = context.getBean(RegionService.class);
        testDisplayRegions(regionService);
    }

    public static void testDisplayRegions(RegionService regionService) {
        LOGGER.info("Start");
        List<Region> regions = regionService.fetchAllRegions();
        LOGGER.debug("Regions: {}", regions);
        LOGGER.info("End");
    }
}
