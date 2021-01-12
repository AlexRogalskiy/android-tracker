// Generated by Dagger (https://dagger.dev).
package org.owntracks.android.ui.preferences.load;

import androidx.fragment.app.FragmentManager;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import org.greenrobot.eventbus.EventBus;
import org.owntracks.android.support.DrawerProvider;
import org.owntracks.android.support.Preferences;
import org.owntracks.android.support.RequirementsChecker;
import org.owntracks.android.ui.base.BaseActivity_MembersInjector;
import org.owntracks.android.ui.base.navigator.Navigator;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoadActivity_MembersInjector implements MembersInjector<LoadActivity> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<LoadMvvm.ViewModel> viewModelProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<DrawerProvider> drawerProvider;

  private final Provider<Preferences> preferencesProvider;

  private final Provider<RequirementsChecker> requirementsCheckerProvider;

  private final Provider<Navigator> navigatorProvider;

  private final Provider<FragmentManager> fragmentManagerProvider;

  private final Provider<EventBus> eventBusProvider2;

  public LoadActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<LoadMvvm.ViewModel> viewModelProvider, Provider<EventBus> eventBusProvider,
      Provider<DrawerProvider> drawerProvider, Provider<Preferences> preferencesProvider,
      Provider<RequirementsChecker> requirementsCheckerProvider,
      Provider<Navigator> navigatorProvider, Provider<FragmentManager> fragmentManagerProvider,
      Provider<EventBus> eventBusProvider2) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.viewModelProvider = viewModelProvider;
    this.eventBusProvider = eventBusProvider;
    this.drawerProvider = drawerProvider;
    this.preferencesProvider = preferencesProvider;
    this.requirementsCheckerProvider = requirementsCheckerProvider;
    this.navigatorProvider = navigatorProvider;
    this.fragmentManagerProvider = fragmentManagerProvider;
    this.eventBusProvider2 = eventBusProvider2;
  }

  public static MembersInjector<LoadActivity> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<LoadMvvm.ViewModel> viewModelProvider, Provider<EventBus> eventBusProvider,
      Provider<DrawerProvider> drawerProvider, Provider<Preferences> preferencesProvider,
      Provider<RequirementsChecker> requirementsCheckerProvider,
      Provider<Navigator> navigatorProvider, Provider<FragmentManager> fragmentManagerProvider,
      Provider<EventBus> eventBusProvider2) {
    return new LoadActivity_MembersInjector(androidInjectorProvider, viewModelProvider, eventBusProvider, drawerProvider, preferencesProvider, requirementsCheckerProvider, navigatorProvider, fragmentManagerProvider, eventBusProvider2);
  }

  @Override
  public void injectMembers(LoadActivity instance) {
    DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    BaseActivity_MembersInjector.injectViewModel(instance, viewModelProvider.get());
    BaseActivity_MembersInjector.injectEventBus(instance, eventBusProvider.get());
    BaseActivity_MembersInjector.injectDrawerProvider(instance, drawerProvider.get());
    BaseActivity_MembersInjector.injectPreferences(instance, preferencesProvider.get());
    BaseActivity_MembersInjector.injectRequirementsChecker(instance, requirementsCheckerProvider.get());
    BaseActivity_MembersInjector.injectNavigator(instance, navigatorProvider.get());
    BaseActivity_MembersInjector.injectFragmentManager(instance, fragmentManagerProvider.get());
    injectEventBus(instance, eventBusProvider2.get());
  }

  @InjectedFieldSignature("org.owntracks.android.ui.preferences.load.LoadActivity.eventBus")
  public static void injectEventBus(LoadActivity instance, EventBus eventBus) {
    instance.eventBus = eventBus;
  }
}
