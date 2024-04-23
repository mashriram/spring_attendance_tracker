package com.shri.attendance_tracker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.metamodel.EntityType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class DatabaseService {

  @Autowired
  private EntityManager entityManager;

  public List<String> getAllTableNames() {
    Set<EntityType<?>> entities = entityManager.getMetamodel().getEntities();
    List<String> tableNames = new ArrayList<>();

    for (EntityType<?> entity : entities) {
      tableNames.add(entity.getName());
      for (var attribute : entity.getAttributes()) {
        System.out.println(attribute.getName());
      }
    }

    return tableNames;
  }

  public List<String> getAttributesForTable(String tableName) {
    Set<EntityType<?>> entities = entityManager.getMetamodel().getEntities();
    EntityType<?> requiredEntity = null;
    for (var entity : entities) {
      if (entity.getName().equalsIgnoreCase(tableName)) {
        requiredEntity = entity;
        break;
      }
    }
    List<String> attributeNames = new ArrayList<>();
    if (requiredEntity != null) {

      for (var attribute : requiredEntity.getAttributes()) {
        attributeNames.add(attribute.getName());
      }

    }
    return attributeNames;
  }
}