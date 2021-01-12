// Generated by data binding compiler. Do not edit!
package org.owntracks.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Deprecated;
import java.lang.Object;
import org.owntracks.android.R;
import org.owntracks.android.ui.contacts.ContactsViewModel;

public abstract class UiContactsBinding extends ViewDataBinding {
  @NonNull
  public final CoordinatorLayout coordinatorLayout;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final Toolbar toolbar;

  @Bindable
  protected ContactsViewModel mVm;

  protected UiContactsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.coordinatorLayout = coordinatorLayout;
    this.recyclerView = recyclerView;
    this.toolbar = toolbar;
  }

  public abstract void setVm(@Nullable ContactsViewModel vm);

  @Nullable
  public ContactsViewModel getVm() {
    return mVm;
  }

  @NonNull
  public static UiContactsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.ui_contacts, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static UiContactsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<UiContactsBinding>inflateInternal(inflater, R.layout.ui_contacts, root, attachToRoot, component);
  }

  @NonNull
  public static UiContactsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.ui_contacts, null, false, component)
   */
  @NonNull
  @Deprecated
  public static UiContactsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<UiContactsBinding>inflateInternal(inflater, R.layout.ui_contacts, null, false, component);
  }

  public static UiContactsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static UiContactsBinding bind(@NonNull View view, @Nullable Object component) {
    return (UiContactsBinding)bind(component, view, R.layout.ui_contacts);
  }
}