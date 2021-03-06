// Generated by Dagger (https://dagger.dev).
package org.owntracks.android.injection.modules;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.greenrobot.eventbus.EventBus;
import org.owntracks.android.data.repos.WaypointsRepo;
import org.owntracks.android.support.Preferences;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ObjectboxWaypointsModule_ProvideWaypointsRepoFactory implements Factory<WaypointsRepo> {
  private final ObjectboxWaypointsModule module;

  private final Provider<Context> contextProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<Preferences> preferencesProvider;

  public ObjectboxWaypointsModule_ProvideWaypointsRepoFactory(ObjectboxWaypointsModule module,
      Provider<Context> contextProvider, Provider<EventBus> eventBusProvider,
      Provider<Preferences> preferencesProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
    this.eventBusProvider = eventBusProvider;
    this.preferencesProvider = preferencesProvider;
  }

  @Override
  public WaypointsRepo get() {
    return provideWaypointsRepo(module, contextProvider.get(), eventBusProvider.get(), preferencesProvider.get());
  }

  public static ObjectboxWaypointsModule_ProvideWaypointsRepoFactory create(
      ObjectboxWaypointsModule module, Provider<Context> contextProvider,
      Provider<EventBus> eventBusProvider, Provider<Preferences> preferencesProvider) {
    return new ObjectboxWaypointsModule_ProvideWaypointsRepoFactory(module, contextProvider, eventBusProvider, preferencesProvider);
  }

  public static WaypointsRepo provideWaypointsRepo(ObjectboxWaypointsModule instance,
      Context context, EventBus eventBus, Preferences preferences) {
    return Preconditions.checkNotNullFromProvides(instance.provideWaypointsRepo(context, eventBus, preferences));
  }
}
