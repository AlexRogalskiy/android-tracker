package org.owntracks.android.injection.modules.android.ActivityModules;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import org.owntracks.android.injection.scopes.PerFragment;
import org.owntracks.android.ui.preferences.AdvancedFragment;

@Module(
  subcomponents =
      PreferencesActivityModule_BindAdvancedPreferencesFragment.AdvancedFragmentSubcomponent.class
)
public abstract class PreferencesActivityModule_BindAdvancedPreferencesFragment {
  private PreferencesActivityModule_BindAdvancedPreferencesFragment() {}

  @Binds
  @IntoMap
  @ClassKey(AdvancedFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AdvancedFragmentSubcomponent.Factory builder);

  @Subcomponent(modules = AdvancedFragment.FragmentModule.class)
  @PerFragment
  public interface AdvancedFragmentSubcomponent extends AndroidInjector<AdvancedFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AdvancedFragment> {}
  }
}
