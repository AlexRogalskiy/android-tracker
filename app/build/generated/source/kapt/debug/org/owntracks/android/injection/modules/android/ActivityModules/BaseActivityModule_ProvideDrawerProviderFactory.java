// Generated by Dagger (https://dagger.dev).
package org.owntracks.android.injection.modules.android.ActivityModules;

import androidx.appcompat.app.AppCompatActivity;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.owntracks.android.services.worker.Scheduler;
import org.owntracks.android.support.DrawerProvider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseActivityModule_ProvideDrawerProviderFactory implements Factory<DrawerProvider> {
  private final Provider<AppCompatActivity> contextProvider;

  private final Provider<Scheduler> schedulerProvider;

  public BaseActivityModule_ProvideDrawerProviderFactory(
      Provider<AppCompatActivity> contextProvider, Provider<Scheduler> schedulerProvider) {
    this.contextProvider = contextProvider;
    this.schedulerProvider = schedulerProvider;
  }

  @Override
  public DrawerProvider get() {
    return provideDrawerProvider(contextProvider.get(), schedulerProvider.get());
  }

  public static BaseActivityModule_ProvideDrawerProviderFactory create(
      Provider<AppCompatActivity> contextProvider, Provider<Scheduler> schedulerProvider) {
    return new BaseActivityModule_ProvideDrawerProviderFactory(contextProvider, schedulerProvider);
  }

  public static DrawerProvider provideDrawerProvider(AppCompatActivity context,
      Scheduler scheduler) {
    return Preconditions.checkNotNullFromProvides(BaseActivityModule.provideDrawerProvider(context, scheduler));
  }
}
