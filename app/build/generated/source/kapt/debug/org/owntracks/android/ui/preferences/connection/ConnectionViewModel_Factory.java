// Generated by Dagger (https://dagger.dev).
package org.owntracks.android.ui.preferences.connection;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;
import org.owntracks.android.support.Preferences;
import org.owntracks.android.ui.base.navigator.Navigator;
import org.owntracks.android.ui.base.viewmodel.BaseViewModel_MembersInjector;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ConnectionViewModel_Factory implements Factory<ConnectionViewModel> {
  private final Provider<Preferences> preferencesProvider;

  private final Provider<Context> contextProvider;

  private final Provider<Navigator> navigatorProvider;

  public ConnectionViewModel_Factory(Provider<Preferences> preferencesProvider,
      Provider<Context> contextProvider, Provider<Navigator> navigatorProvider) {
    this.preferencesProvider = preferencesProvider;
    this.contextProvider = contextProvider;
    this.navigatorProvider = navigatorProvider;
  }

  @Override
  public ConnectionViewModel get() {
    ConnectionViewModel instance = newInstance(preferencesProvider.get(), contextProvider.get());
    BaseViewModel_MembersInjector.injectNavigator(instance, navigatorProvider.get());
    return instance;
  }

  public static ConnectionViewModel_Factory create(Provider<Preferences> preferencesProvider,
      Provider<Context> contextProvider, Provider<Navigator> navigatorProvider) {
    return new ConnectionViewModel_Factory(preferencesProvider, contextProvider, navigatorProvider);
  }

  public static ConnectionViewModel newInstance(Preferences preferences, Context context) {
    return new ConnectionViewModel(preferences, context);
  }
}
