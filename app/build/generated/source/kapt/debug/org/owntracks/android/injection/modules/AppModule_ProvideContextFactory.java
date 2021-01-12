// Generated by Dagger (https://dagger.dev).
package org.owntracks.android.injection.modules;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.owntracks.android.App;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideContextFactory implements Factory<Context> {
  private final AppModule module;

  private final Provider<App> appProvider;

  public AppModule_ProvideContextFactory(AppModule module, Provider<App> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public Context get() {
    return provideContext(module, appProvider.get());
  }

  public static AppModule_ProvideContextFactory create(AppModule module,
      Provider<App> appProvider) {
    return new AppModule_ProvideContextFactory(module, appProvider);
  }

  public static Context provideContext(AppModule instance, App app) {
    return Preconditions.checkNotNullFromProvides(instance.provideContext(app));
  }
}