// Generated by Dagger (https://dagger.dev).
package org.owntracks.android.injection.modules.android.FragmentModules;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseSupportFragmentModule_ProvideDefaultFragmentManagerFactory implements Factory<FragmentManager> {
  private final Provider<Fragment> fProvider;

  public BaseSupportFragmentModule_ProvideDefaultFragmentManagerFactory(
      Provider<Fragment> fProvider) {
    this.fProvider = fProvider;
  }

  @Override
  public FragmentManager get() {
    return provideDefaultFragmentManager(fProvider.get());
  }

  public static BaseSupportFragmentModule_ProvideDefaultFragmentManagerFactory create(
      Provider<Fragment> fProvider) {
    return new BaseSupportFragmentModule_ProvideDefaultFragmentManagerFactory(fProvider);
  }

  public static FragmentManager provideDefaultFragmentManager(Fragment f) {
    return Preconditions.checkNotNullFromProvides(BaseSupportFragmentModule.provideDefaultFragmentManager(f));
  }
}
