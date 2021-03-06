package com.linkedin.thirdeye.anomaly;

import com.linkedin.thirdeye.anomaly.monitor.MonitorConfiguration;
import com.linkedin.thirdeye.common.ThirdEyeConfiguration;

public class ThirdEyeAnomalyConfiguration extends ThirdEyeConfiguration {
  private boolean scheduler = false;
  private boolean worker = false;
  private boolean monitor = false;
  private boolean alert = false;
  private boolean merger = false;
  private boolean autoload = false;
  private boolean dataCompleteness = false;
  private String datasetsToCheck = "";

  private long id;
  private String dashboardHost;
  private SmtpConfiguration smtpConfiguration;
  private MonitorConfiguration monitorConfiguration = new MonitorConfiguration();
  private String failureFromAddress;
  private String failureToAddress;

  public String getDashboardHost() {
    return dashboardHost;
  }

  public void setDashboardHost(String dashboardHost) {
    this.dashboardHost = dashboardHost;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public boolean isScheduler() {
    return scheduler;
  }

  public void setScheduler(boolean scheduler) {
    this.scheduler = scheduler;
  }

  public boolean isWorker() {
    return worker;
  }

  public void setWorker(boolean worker) {
    this.worker = worker;
  }

  public boolean isMonitor() {
    return monitor;
  }

  public void setMonitor(boolean monitor) {
    this.monitor = monitor;
  }

  public MonitorConfiguration getMonitorConfiguration() {
    return monitorConfiguration;
  }

  public void setMonitorConfiguration(MonitorConfiguration monitorConfiguration) {
    this.monitorConfiguration = monitorConfiguration;
  }

  public boolean isAlert() {
    return alert;
  }

  public void setAlert(boolean alert) {
    this.alert = alert;
  }

  public SmtpConfiguration getSmtpConfiguration() {
    return smtpConfiguration;
  }

  public boolean isMerger() {
    return merger;
  }

  public void setMerger(boolean merger) {
    this.merger = merger;
  }

  public boolean isAutoload() {
    return autoload;
  }

  public void setAutoload(boolean autoload) {
    this.autoload = autoload;
  }

  public boolean isDataCompleteness() {
    return dataCompleteness;
  }

  public void setDataCompleteness(boolean dataCompleteness) {
    this.dataCompleteness = dataCompleteness;
  }

  public String getDatasetsToCheck() {
    return datasetsToCheck;
  }

  public void setDatasetsToCheck(String datasetsToCheck) {
    this.datasetsToCheck = datasetsToCheck;
  }

  public void setSmtpConfiguration(SmtpConfiguration smtpConfiguration) {
    this.smtpConfiguration = smtpConfiguration;
  }

  public String getFailureFromAddress() {
    return failureFromAddress;
  }

  public void setFailureFromAddress(String failureFromAddress) {
    this.failureFromAddress = failureFromAddress;
  }

  public String getFailureToAddress() {
    return failureToAddress;
  }

  public void setFailureToAddress(String failureToAddress) {
    this.failureToAddress = failureToAddress;
  }

}
