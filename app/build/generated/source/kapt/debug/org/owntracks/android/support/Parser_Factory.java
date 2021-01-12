// Generated by Dagger (https://dagger.dev).
package org.owntracks.android.support;

import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Parser_Factory implements Factory<Parser> {
  private final Provider<EncryptionProvider> encryptionProvider;

  public Parser_Factory(Provider<EncryptionProvider> encryptionProvider) {
    this.encryptionProvider = encryptionProvider;
  }

  @Override
  public Parser get() {
    return newInstance(encryptionProvider.get());
  }

  public static Parser_Factory create(Provider<EncryptionProvider> encryptionProvider) {
    return new Parser_Factory(encryptionProvider);
  }

  public static Parser newInstance(EncryptionProvider encryptionProvider) {
    return new Parser(encryptionProvider);
  }
}
