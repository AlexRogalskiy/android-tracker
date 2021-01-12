// Generated by Dagger (https://dagger.dev).
package org.owntracks.android.ui.base.viewmodel;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.owntracks.android.ui.base.navigator.Navigator;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NoOpViewModel_Factory implements Factory<NoOpViewModel> {
  private final Provider<Navigator> navigatorProvider;

  public NoOpViewModel_Factory(Provider<Navigator> navigatorProvider) {
    this.navigatorProvider = navigatorProvider;
  }

  @Override
  public NoOpViewModel get() {
    NoOpViewModel instance = newInstance();
    BaseViewModel_MembersInjector.injectNavigator(instance, navigatorProvider.get());
    return instance;
  }

  public static NoOpViewModel_Factory create(Provider<Navigator> navigatorProvider) {
    return new NoOpViewModel_Factory(navigatorProvider);
  }

  public static NoOpViewModel newInstance() {
    return new NoOpViewModel();
  }
}