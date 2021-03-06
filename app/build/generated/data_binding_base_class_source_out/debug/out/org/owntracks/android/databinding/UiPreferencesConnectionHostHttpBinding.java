// Generated by data binding compiler. Do not edit!
package org.owntracks.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import org.owntracks.android.R;
import org.owntracks.android.ui.preferences.connection.dialog.ConnectionHostHttpDialogViewModel;

public abstract class UiPreferencesConnectionHostHttpBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout contentFrame;

  @NonNull
  public final EditText url;

  @Bindable
  protected ConnectionHostHttpDialogViewModel mVm;

  protected UiPreferencesConnectionHostHttpBinding(Object _bindingComponent, View _root,
      int _localFieldCount, LinearLayout contentFrame, EditText url) {
    super(_bindingComponent, _root, _localFieldCount);
    this.contentFrame = contentFrame;
    this.url = url;
  }

  public abstract void setVm(@Nullable ConnectionHostHttpDialogViewModel vm);

  @Nullable
  public ConnectionHostHttpDialogViewModel getVm() {
    return mVm;
  }

  @NonNull
  public static UiPreferencesConnectionHostHttpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.ui_preferences_connection_host_http, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static UiPreferencesConnectionHostHttpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<UiPreferencesConnectionHostHttpBinding>inflateInternal(inflater, R.layout.ui_preferences_connection_host_http, root, attachToRoot, component);
  }

  @NonNull
  public static UiPreferencesConnectionHostHttpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.ui_preferences_connection_host_http, null, false, component)
   */
  @NonNull
  @Deprecated
  public static UiPreferencesConnectionHostHttpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<UiPreferencesConnectionHostHttpBinding>inflateInternal(inflater, R.layout.ui_preferences_connection_host_http, null, false, component);
  }

  public static UiPreferencesConnectionHostHttpBinding bind(@NonNull View view) {
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
  public static UiPreferencesConnectionHostHttpBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (UiPreferencesConnectionHostHttpBinding)bind(component, view, R.layout.ui_preferences_connection_host_http);
  }
}
