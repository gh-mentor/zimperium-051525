package com.assemblyline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryAssemblyLineTest {

  @Test
  void initialization_ShouldSetCorrectValues() {
    FactoryAssemblyLine line = new FactoryAssemblyLine(5);
    assertEquals(5, line.getNumStations());
    assertEquals(0, line.getNumActiveStations());
    assertEquals(5, line.getNumInactiveStations());
  }

  @Test
  void initialization_WithNegativeStations_ShouldThrowIllegalArgumentException() {
    assertThrows(IllegalArgumentException.class, () -> new FactoryAssemblyLine(-1));
  }

  @Test
  void addStation_ShouldAddStationCorrectly() {
    FactoryAssemblyLine line = new FactoryAssemblyLine(5);
    line.addStation(1, 10);
    assertEquals(10, line.getProcessingTime(1));
    assertEquals(4, line.getNumInactiveStations());
  }

  @Test
  void removeStation_ShouldRemoveStationCorrectly() {
    FactoryAssemblyLine line = new FactoryAssemblyLine(5);
    line.addStation(1, 10);
    line.removeStation(1);
    assertThrows(IllegalArgumentException.class, () -> line.getProcessingTime(1));
    assertEquals(5, line.getNumInactiveStations());
  }

  @Test
  void addStation_WithInvalidId_ShouldThrowIllegalArgumentException() {
    FactoryAssemblyLine line = new FactoryAssemblyLine(5);
    assertThrows(IllegalArgumentException.class, () -> line.addStation(-1, 10));
  }

  @Test
  void removeStation_WithNonExistentId_ShouldThrowIllegalArgumentException() {
    FactoryAssemblyLine line = new FactoryAssemblyLine(5);
    assertThrows(IllegalArgumentException.class, () -> line.removeStation(1));
  }

  @Test
  void startAssembly_ShouldActivateStation() {
    FactoryAssemblyLine line = new FactoryAssemblyLine(5);
    line.addStation(1, 10);
    line.startAssembly(1);
    assertTrue(line.isStationActive(1));
    assertEquals(1, line.getNumActiveStations());
  }

  @Test
  void stopAssembly_ShouldDeactivateStation() {
    FactoryAssemblyLine line = new FactoryAssemblyLine(5);
    line.addStation(1, 10);
    line.startAssembly(1);
    line.stopAssembly(1);
    assertFalse(line.isStationActive(1));
    assertEquals(0, line.getNumActiveStations());
  }

  @Test
  void startAssembly_WithInvalidId_ShouldThrowIllegalArgumentException() {
    FactoryAssemblyLine line = new FactoryAssemblyLine(5);
    assertThrows(IllegalArgumentException.class, () -> line.startAssembly(10));
  }

  @Test
  void stopAssembly_WithInvalidId_ShouldThrowIllegalArgumentException() {
    FactoryAssemblyLine line = new FactoryAssemblyLine(5);
    assertThrows(IllegalArgumentException.class, () -> line.stopAssembly(10));
  }

  @Test
  void totalProcessingTime_ShouldReturnCorrectValue() {
    FactoryAssemblyLine line = new FactoryAssemblyLine(5);
    line.addStation(1, 10);
    line.addStation(2, 20);
    line.startAssembly(1);
    line.startAssembly(2);
    assertEquals(30, line.getTotalProcessingTime());
  }

  @Test
  void inactiveStations_ShouldNotAffectTotalProcessingTime() {
    FactoryAssemblyLine line = new FactoryAssemblyLine(5);
    line.addStation(1, 10);
    line.startAssembly(1);
    assertEquals(10, line.getTotalProcessingTime());
  }

  @Test
  void addDuplicateStation_ShouldThrowIllegalArgumentException() {
    FactoryAssemblyLine line = new FactoryAssemblyLine(5);
    line.addStation(1, 10);
    assertThrows(IllegalArgumentException.class, () -> line.addStation(1, 15));
  }

  @Test
  void startAssembly_NonExistentStation_ShouldThrowIllegalArgumentException() {
    FactoryAssemblyLine line = new FactoryAssemblyLine(5);
    assertThrows(IllegalArgumentException.class, () -> line.startAssembly(1));
  }

  @Test
  void stopAssembly_NonExistentStation_ShouldThrowIllegalArgumentException() {
    FactoryAssemblyLine line = new FactoryAssemblyLine(5);
    assertThrows(IllegalArgumentException.class, () -> line.stopAssembly(1));
  }
}