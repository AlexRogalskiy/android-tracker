// Generated by Dagger (https://dagger.dev).
package org.owntracks.android.injection.modules.android.ActivityModules;

import androidx.appcompat.app.AppCompatActivity;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.owntracks.android.ui.base.navigator.Navigator;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseActivityModule_ProvideNavigatorFactory implements Factory<Navigator> {
  private final Provider<AppCompatActivity> contextProvider;

  public BaseActivityModule_ProvideNavigatorFactory(Provider<AppCompatActivity> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public Navigator get() {
    return provideNavigator(contextProvider.get());
  }

  public static BaseActivityModule_ProvideNavigatorFactory create(
      Provider<AppCompatActivity> contextProvider) {
    return new BaseActivityModule_ProvideNavigatorFactory(contextProvider);
  }

  public static Navigator provideNavigator(AppCompatActivity context) {
    return Preconditions.checkNotNullFromProvides(BaseActivityModule.provideNavigator(context));
  }
}
