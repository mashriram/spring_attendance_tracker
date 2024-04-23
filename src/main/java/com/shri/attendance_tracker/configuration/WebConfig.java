package com.shri.attendance_tracker.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.shri.attendance_tracker.models.Attendance;
import com.shri.attendance_tracker.models.Kaksha;
import com.shri.attendance_tracker.models.Student;
import com.shri.attendance_tracker.models.Subject;
import com.shri.attendance_tracker.models.TimeTable;

@Configuration
public class WebConfig implements WebMvcConfigurer {

  @Override
  public void addCorsMappings(@NonNull CorsRegistry registry) {
    registry.addMapping("/**")
        .allowedOrigins("*")
        .allowedMethods("GET", "POST", "PUT", "DELETE")
        .allowedHeaders("*")
        .maxAge(3600);
  }

  @Bean
  public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
      @Override
      public void addCorsMappings(@NonNull CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("*")
            .allowedMethods("GET", "POST", "PUT", "DELETE")
            .allowedHeaders("*")
            .maxAge(3600);
      }
    };
  }

  // @Autowired
  // private EntityManager entityManager;

  // @Bean
  // public RepositoryRestConfigurer repositoryRestConfigurer() {
  // return RepositoryRestConfigurer.withConfig(config -> config.exposeIdsFor(
  // entityManager.getMetamodel().getEntities().stream().map(Type::getJavaType).toArray(Class[]::new)));
  // }

  @Bean
  public RepositoryRestConfigurer repositoryRestConfigurer() {
    return RepositoryRestConfigurer.withConfig(config -> {
      config.exposeIdsFor(Attendance.class);
      config.exposeIdsFor(Kaksha.class);
      config.exposeIdsFor(Student.class);
      config.exposeIdsFor(Subject.class);
      config.exposeIdsFor(TimeTable.class);
    });
  }
}
