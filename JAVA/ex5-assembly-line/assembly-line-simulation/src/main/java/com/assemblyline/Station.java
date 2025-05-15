package com.assemblyline;

public class Station {
  private final int processingTime;
  private boolean isActive;

  public Station(int processingTime) {
    this.processingTime = processingTime;
    this.isActive = false;
  }

  public int getProcessingTime() {
    return processingTime;
  }

  public boolean isActive() {
    return isActive;
  }

  public void activate() {
    isActive = true;
  }

  public void deactivate() {
    isActive = false;
  }
}