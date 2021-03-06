// Generated by Dagger (https://dagger.dev).
package org.owntracks.android.support.receiver;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import org.owntracks.android.support.Preferences;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class StartBackgroundServiceReceiver_MembersInjector implements MembersInjector<StartBackgroundServiceReceiver> {
  private final Provider<Preferences> preferencesProvider;

  public StartBackgroundServiceReceiver_MembersInjector(Provider<Preferences> preferencesProvider) {
    this.preferencesProvider = preferencesProvider;
  }

  public static MembersInjector<StartBackgroundServiceReceiver> create(
      Provider<Preferences> preferencesProvider) {
    return new StartBackgroundServiceReceiver_MembersInjector(preferencesProvider);
  }

  @Override
  public void injectMembers(StartBackgroundServiceReceiver instance) {
    injectPreferences(instance, preferencesProvider.get());
  }

  @InjectedFieldSignature("org.owntracks.android.support.receiver.StartBackgroundServiceReceiver.preferences")
  public static void injectPreferences(StartBackgroundServiceReceiver instance,
      Preferences preferences) {
    instance.preferences = preferences;
  }
}
