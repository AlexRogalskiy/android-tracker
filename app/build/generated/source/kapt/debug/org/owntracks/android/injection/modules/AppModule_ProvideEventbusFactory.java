// Generated by Dagger (https://dagger.dev).
package org.owntracks.android.injection.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.greenrobot.eventbus.EventBus;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideEventbusFactory implements Factory<EventBus> {
  private final AppModule module;

  public AppModule_ProvideEventbusFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public EventBus get() {
    return provideEventbus(module);
  }

  public static AppModule_ProvideEventbusFactory create(AppModule module) {
    return new AppModule_ProvideEventbusFactory(module);
  }

  public static EventBus provideEventbus(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideEventbus());
  }
}
