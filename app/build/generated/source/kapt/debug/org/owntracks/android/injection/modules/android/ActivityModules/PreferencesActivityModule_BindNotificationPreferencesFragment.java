package org.owntracks.android.injection.modules.android.ActivityModules;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import org.owntracks.android.injection.scopes.PerFragment;
import org.owntracks.android.ui.preferences.NotificationFragment;

@Module(
  subcomponents =
      PreferencesActivityModule_BindNotificationPreferencesFragment.NotificationFragmentSubcomponent
          .class
)
public abstract class PreferencesActivityModule_BindNotificationPreferencesFragment {
  private PreferencesActivityModule_BindNotificationPreferencesFragment() {}

  @Binds
  @IntoMap
  @ClassKey(NotificationFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      NotificationFragmentSubcomponent.Factory builder);

  @Subcomponent(modules = NotificationFragment.FragmentModule.class)
  @PerFragment
  public interface NotificationFragmentSubcomponent extends AndroidInjector<NotificationFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<NotificationFragment> {}
  }
}
