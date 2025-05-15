package com.assemblyline;

import java.util.HashMap;
import java.util.Map;

/**
 * The FactoryAssemblyLine class represents an assembly line with multiple stations.
 * It implements the IFactoryAssemblyLine interface and provides methods to manage
 * the stations in the assembly line.
 */
public class FactoryAssemblyLine implements IFactoryAssemblyLine {
  
  private final Map<Integer, Station> _stations;
  private final int _numStations;
  private int _numActiveStations;

  /**
   * Constructs a FactoryAssemblyLine with the specified number of stations.
   *
   * @param numStations The total number of stations in the assembly line.
   * @throws IllegalArgumentException if numStations is negative.
   */
  public FactoryAssemblyLine(int numStations) {
    if (numStations < 0) {
      throw new IllegalArgumentException("Number of stations cannot be negative");
    }

    _numStations = numStations;
    _stations = new HashMap<>();
    _numActiveStations = 0;
  }

  @Override
  public void addStation(int stationId, int processingTime) {
    throw new UnsupportedOperationException("Method not implemented");
  }

  @Override
  public void removeStation(int stationId) {
    throw new UnsupportedOperationException("Method not implemented");
  }

  @Override
  public void startAssembly(int stationId) {
    throw new UnsupportedOperationException("Method not implemented");
  }

  @Override
  public void stopAssembly(int stationId) {
    throw new UnsupportedOperationException("Method not implemented");
  }

  @Override
  public int getProcessingTime(int stationId) {
    throw new UnsupportedOperationException("Method not implemented");
  }

  @Override
  public int getTotalProcessingTime() {
    throw new UnsupportedOperationException("Method not implemented");
  }

  @Override
  public int getNumStations() {
    return _numStations;
  }

  @Override
  public int getNumActiveStations() {
    return _numActiveStations;
  }

  @Override
  public int getNumInactiveStations() {
    return _numStations - _numActiveStations;
  }

  @Override
  public boolean isStationActive(int stationId) {
    throw new UnsupportedOperationException("Method not implemented");
  }
}