// Generated by Dagger (https://dagger.dev).
package org.owntracks.android.support;

import dagger.internal.Factory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ServiceBridge_Factory implements Factory<ServiceBridge> {
  @Override
  public ServiceBridge get() {
    return newInstance();
  }

  public static ServiceBridge_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ServiceBridge newInstance() {
    return new ServiceBridge();
  }

  private static final class InstanceHolder {
    private static final ServiceBridge_Factory INSTANCE = new ServiceBridge_Factory();
  }
}
