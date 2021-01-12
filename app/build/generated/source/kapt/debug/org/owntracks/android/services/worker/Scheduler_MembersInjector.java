// Generated by Dagger (https://dagger.dev).
package org.owntracks.android.services.worker;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import org.owntracks.android.support.Preferences;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Scheduler_MembersInjector implements MembersInjector<Scheduler> {
  private final Provider<Preferences> preferencesProvider;

  public Scheduler_MembersInjector(Provider<Preferences> preferencesProvider) {
    this.preferencesProvider = preferencesProvider;
  }

  public static MembersInjector<Scheduler> create(Provider<Preferences> preferencesProvider) {
    return new Scheduler_MembersInjector(preferencesProvider);
  }

  @Override
  public void injectMembers(Scheduler instance) {
    injectPreferences(instance, preferencesProvider.get());
  }

  @InjectedFieldSignature("org.owntracks.android.services.worker.Scheduler.preferences")
  public static void injectPreferences(Scheduler instance, Preferences preferences) {
    instance.preferences = preferences;
  }
}