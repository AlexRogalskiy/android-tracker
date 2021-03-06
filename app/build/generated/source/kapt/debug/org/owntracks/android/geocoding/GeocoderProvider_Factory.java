// Generated by Dagger (https://dagger.dev).
package org.owntracks.android.geocoding;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.owntracks.android.support.Preferences;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GeocoderProvider_Factory implements Factory<GeocoderProvider> {
  private final Provider<Context> contextProvider;

  private final Provider<Preferences> preferencesProvider;

  public GeocoderProvider_Factory(Provider<Context> contextProvider,
      Provider<Preferences> preferencesProvider) {
    this.contextProvider = contextProvider;
    this.preferencesProvider = preferencesProvider;
  }

  @Override
  public GeocoderProvider get() {
    return newInstance(contextProvider.get(), preferencesProvider.get());
  }

  public static GeocoderProvider_Factory create(Provider<Context> contextProvider,
      Provider<Preferences> preferencesProvider) {
    return new GeocoderProvider_Factory(contextProvider, preferencesProvider);
  }

  public static GeocoderProvider newInstance(Context context, Preferences preferences) {
    return new GeocoderProvider(context, preferences);
  }
}
