// Generated by Dagger (https://dagger.dev).
package org.owntracks.android.injection.modules.android.ServiceModules;

import android.app.Service;
import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BackgroundServiceModule_ServiceContextFactory implements Factory<Context> {
  private final Provider<Service> serviceProvider;

  public BackgroundServiceModule_ServiceContextFactory(Provider<Service> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  @Override
  public Context get() {
    return serviceContext(serviceProvider.get());
  }

  public static BackgroundServiceModule_ServiceContextFactory create(
      Provider<Service> serviceProvider) {
    return new BackgroundServiceModule_ServiceContextFactory(serviceProvider);
  }

  public static Context serviceContext(Service service) {
    return Preconditions.checkNotNullFromProvides(BackgroundServiceModule.serviceContext(service));
  }
}
