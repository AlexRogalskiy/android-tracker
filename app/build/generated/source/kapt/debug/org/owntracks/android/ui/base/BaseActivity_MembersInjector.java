// Generated by Dagger (https://dagger.dev).
package org.owntracks.android.ui.base;

import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentManager;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Named;
import javax.inject.Provider;
import org.greenrobot.eventbus.EventBus;
import org.owntracks.android.support.DrawerProvider;
import org.owntracks.android.support.Preferences;
import org.owntracks.android.support.RequirementsChecker;
import org.owntracks.android.ui.base.navigator.Navigator;
import org.owntracks.android.ui.base.viewmodel.MvvmViewModel;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseActivity_MembersInjector<B extends ViewDataBinding, V extends MvvmViewModel> implements MembersInjector<BaseActivity<B, V>> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<V> viewModelProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<DrawerProvider> drawerProvider;

  private final Provider<Preferences> preferencesProvider;

  private final Provider<RequirementsChecker> requirementsCheckerProvider;

  private final Provider<Navigator> navigatorProvider;

  private final Provider<FragmentManager> fragmentManagerProvider;

  public BaseActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<V> viewModelProvider, Provider<EventBus> eventBusProvider,
      Provider<DrawerProvider> drawerProvider, Provider<Preferences> preferencesProvider,
      Provider<RequirementsChecker> requirementsCheckerProvider,
      Provider<Navigator> navigatorProvider, Provider<FragmentManager> fragmentManagerProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.viewModelProvider = viewModelProvider;
    this.eventBusProvider = eventBusProvider;
    this.drawerProvider = drawerProvider;
    this.preferencesProvider = preferencesProvider;
    this.requirementsCheckerProvider = requirementsCheckerProvider;
    this.navigatorProvider = navigatorProvider;
    this.fragmentManagerProvider = fragmentManagerProvider;
  }

  public static <B extends ViewDataBinding, V extends MvvmViewModel> MembersInjector<BaseActivity<B, V>> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<V> viewModelProvider, Provider<EventBus> eventBusProvider,
      Provider<DrawerProvider> drawerProvider, Provider<Preferences> preferencesProvider,
      Provider<RequirementsChecker> requirementsCheckerProvider,
      Provider<Navigator> navigatorProvider, Provider<FragmentManager> fragmentManagerProvider) {
    return new BaseActivity_MembersInjector<B, V>(androidInjectorProvider, viewModelProvider, eventBusProvider, drawerProvider, preferencesProvider, requirementsCheckerProvider, navigatorProvider, fragmentManagerProvider);
  }

  @Override
  public void injectMembers(BaseActivity<B, V> instance) {
    DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectViewModel(instance, viewModelProvider.get());
    injectEventBus(instance, eventBusProvider.get());
    injectDrawerProvider(instance, drawerProvider.get());
    injectPreferences(instance, preferencesProvider.get());
    injectRequirementsChecker(instance, requirementsCheckerProvider.get());
    injectNavigator(instance, navigatorProvider.get());
    injectFragmentManager(instance, fragmentManagerProvider.get());
  }

  @InjectedFieldSignature("org.owntracks.android.ui.base.BaseActivity.viewModel")
  public static <B extends ViewDataBinding, V extends MvvmViewModel> void injectViewModel(
      BaseActivity<B, V> instance, V viewModel) {
    instance.viewModel = viewModel;
  }

  @InjectedFieldSignature("org.owntracks.android.ui.base.BaseActivity.eventBus")
  public static <B extends ViewDataBinding, V extends MvvmViewModel> void injectEventBus(
      BaseActivity<B, V> instance, EventBus eventBus) {
    instance.eventBus = eventBus;
  }

  @InjectedFieldSignature("org.owntracks.android.ui.base.BaseActivity.drawerProvider")
  public static <B extends ViewDataBinding, V extends MvvmViewModel> void injectDrawerProvider(
      BaseActivity<B, V> instance, DrawerProvider drawerProvider) {
    instance.drawerProvider = drawerProvider;
  }

  @InjectedFieldSignature("org.owntracks.android.ui.base.BaseActivity.preferences")
  public static <B extends ViewDataBinding, V extends MvvmViewModel> void injectPreferences(
      BaseActivity<B, V> instance, Preferences preferences) {
    instance.preferences = preferences;
  }

  @InjectedFieldSignature("org.owntracks.android.ui.base.BaseActivity.requirementsChecker")
  public static <B extends ViewDataBinding, V extends MvvmViewModel> void injectRequirementsChecker(
      BaseActivity<B, V> instance, RequirementsChecker requirementsChecker) {
    instance.requirementsChecker = requirementsChecker;
  }

  @InjectedFieldSignature("org.owntracks.android.ui.base.BaseActivity.navigator")
  public static <B extends ViewDataBinding, V extends MvvmViewModel> void injectNavigator(
      BaseActivity<B, V> instance, Navigator navigator) {
    instance.navigator = navigator;
  }

  @InjectedFieldSignature("org.owntracks.android.ui.base.BaseActivity.fragmentManager")
  @Named("BaseActivityModule.activityFragmentManager")
  public static <B extends ViewDataBinding, V extends MvvmViewModel> void injectFragmentManager(
      BaseActivity<B, V> instance, FragmentManager fragmentManager) {
    instance.fragmentManager = fragmentManager;
  }
}
