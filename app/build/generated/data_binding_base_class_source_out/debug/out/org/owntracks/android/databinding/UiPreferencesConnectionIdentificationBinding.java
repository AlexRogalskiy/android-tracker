// Generated by data binding compiler. Do not edit!
package org.owntracks.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.rengwuxian.materialedittext.MaterialEditText;
import java.lang.Deprecated;
import java.lang.Object;
import org.owntracks.android.R;
import org.owntracks.android.ui.preferences.connection.dialog.ConnectionIdentificationViewModel;

public abstract class UiPreferencesConnectionIdentificationBinding extends ViewDataBinding {
  @NonNull
  public final MaterialEditText deviceId;

  @NonNull
  public final MaterialEditText password;

  @NonNull
  public final MaterialEditText trackerId;

  @NonNull
  public final MaterialEditText username;

  @Bindable
  protected ConnectionIdentificationViewModel mVm;

  protected UiPreferencesConnectionIdentificationBinding(Object _bindingComponent, View _root,
      int _localFieldCount, MaterialEditText deviceId, MaterialEditText password,
      MaterialEditText trackerId, MaterialEditText username) {
    super(_bindingComponent, _root, _localFieldCount);
    this.deviceId = deviceId;
    this.password = password;
    this.trackerId = trackerId;
    this.username = username;
  }

  public abstract void setVm(@Nullable ConnectionIdentificationViewModel vm);

  @Nullable
  public ConnectionIdentificationViewModel getVm() {
    return mVm;
  }

  @NonNull
  public static UiPreferencesConnectionIdentificationBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.ui_preferences_connection_identification, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static UiPreferencesConnectionIdentificationBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot,
      @Nullable Object component) {
    return ViewDataBinding.<UiPreferencesConnectionIdentificationBinding>inflateInternal(inflater, R.layout.ui_preferences_connection_identification, root, attachToRoot, component);
  }

  @NonNull
  public static UiPreferencesConnectionIdentificationBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.ui_preferences_connection_identification, null, false, component)
   */
  @NonNull
  @Deprecated
  public static UiPreferencesConnectionIdentificationBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable Object component) {
    return ViewDataBinding.<UiPreferencesConnectionIdentificationBinding>inflateInternal(inflater, R.layout.ui_preferences_connection_identification, null, false, component);
  }

  public static UiPreferencesConnectionIdentificationBinding bind(@NonNull View view) {
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
  public static UiPreferencesConnectionIdentificationBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (UiPreferencesConnectionIdentificationBinding)bind(component, view, R.layout.ui_preferences_connection_identification);
  }
}