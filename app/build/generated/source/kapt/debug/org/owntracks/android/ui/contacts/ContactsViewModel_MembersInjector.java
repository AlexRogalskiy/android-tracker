// Generated by Dagger (https://dagger.dev).
package org.owntracks.android.ui.contacts;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.owntracks.android.ui.base.navigator.Navigator;
import org.owntracks.android.ui.base.viewmodel.BaseViewModel_MembersInjector;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ContactsViewModel_MembersInjector implements MembersInjector<ContactsViewModel> {
  private final Provider<Navigator> navigatorProvider;

  public ContactsViewModel_MembersInjector(Provider<Navigator> navigatorProvider) {
    this.navigatorProvider = navigatorProvider;
  }

  public static MembersInjector<ContactsViewModel> create(Provider<Navigator> navigatorProvider) {
    return new ContactsViewModel_MembersInjector(navigatorProvider);
  }

  @Override
  public void injectMembers(ContactsViewModel instance) {
    BaseViewModel_MembersInjector.injectNavigator(instance, navigatorProvider.get());
  }
}
