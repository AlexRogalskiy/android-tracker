// Generated by Dagger (https://dagger.dev).
package org.owntracks.android.services;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import org.greenrobot.eventbus.EventBus;
import org.owntracks.android.data.repos.ContactsRepo;
import org.owntracks.android.data.repos.LocationRepo;
import org.owntracks.android.data.repos.WaypointsRepo;
import org.owntracks.android.geocoding.GeocoderProvider;
import org.owntracks.android.services.worker.Scheduler;
import org.owntracks.android.support.Preferences;
import org.owntracks.android.support.RunThingsOnOtherThreads;
import org.owntracks.android.support.ServiceBridge;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BackgroundService_MembersInjector implements MembersInjector<BackgroundService> {
  private final Provider<Preferences> preferencesProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<Scheduler> schedulerProvider;

  private final Provider<LocationProcessor> locationProcessorProvider;

  private final Provider<GeocoderProvider> geocoderProvider;

  private final Provider<ContactsRepo> contactsRepoProvider;

  private final Provider<LocationRepo> locationRepoProvider;

  private final Provider<RunThingsOnOtherThreads> runThingsOnOtherThreadsProvider;

  private final Provider<WaypointsRepo> waypointsRepoProvider;

  private final Provider<ServiceBridge> serviceBridgeProvider;

  public BackgroundService_MembersInjector(Provider<Preferences> preferencesProvider,
      Provider<EventBus> eventBusProvider, Provider<Scheduler> schedulerProvider,
      Provider<LocationProcessor> locationProcessorProvider,
      Provider<GeocoderProvider> geocoderProvider, Provider<ContactsRepo> contactsRepoProvider,
      Provider<LocationRepo> locationRepoProvider,
      Provider<RunThingsOnOtherThreads> runThingsOnOtherThreadsProvider,
      Provider<WaypointsRepo> waypointsRepoProvider,
      Provider<ServiceBridge> serviceBridgeProvider) {
    this.preferencesProvider = preferencesProvider;
    this.eventBusProvider = eventBusProvider;
    this.schedulerProvider = schedulerProvider;
    this.locationProcessorProvider = locationProcessorProvider;
    this.geocoderProvider = geocoderProvider;
    this.contactsRepoProvider = contactsRepoProvider;
    this.locationRepoProvider = locationRepoProvider;
    this.runThingsOnOtherThreadsProvider = runThingsOnOtherThreadsProvider;
    this.waypointsRepoProvider = waypointsRepoProvider;
    this.serviceBridgeProvider = serviceBridgeProvider;
  }

  public static MembersInjector<BackgroundService> create(Provider<Preferences> preferencesProvider,
      Provider<EventBus> eventBusProvider, Provider<Scheduler> schedulerProvider,
      Provider<LocationProcessor> locationProcessorProvider,
      Provider<GeocoderProvider> geocoderProvider, Provider<ContactsRepo> contactsRepoProvider,
      Provider<LocationRepo> locationRepoProvider,
      Provider<RunThingsOnOtherThreads> runThingsOnOtherThreadsProvider,
      Provider<WaypointsRepo> waypointsRepoProvider,
      Provider<ServiceBridge> serviceBridgeProvider) {
    return new BackgroundService_MembersInjector(preferencesProvider, eventBusProvider, schedulerProvider, locationProcessorProvider, geocoderProvider, contactsRepoProvider, locationRepoProvider, runThingsOnOtherThreadsProvider, waypointsRepoProvider, serviceBridgeProvider);
  }

  @Override
  public void injectMembers(BackgroundService instance) {
    injectPreferences(instance, preferencesProvider.get());
    injectEventBus(instance, eventBusProvider.get());
    injectScheduler(instance, schedulerProvider.get());
    injectLocationProcessor(instance, locationProcessorProvider.get());
    injectGeocoderProvider(instance, geocoderProvider.get());
    injectContactsRepo(instance, contactsRepoProvider.get());
    injectLocationRepo(instance, locationRepoProvider.get());
    injectRunThingsOnOtherThreads(instance, runThingsOnOtherThreadsProvider.get());
    injectWaypointsRepo(instance, waypointsRepoProvider.get());
    injectServiceBridge(instance, serviceBridgeProvider.get());
  }

  @InjectedFieldSignature("org.owntracks.android.services.BackgroundService.preferences")
  public static void injectPreferences(BackgroundService instance, Preferences preferences) {
    instance.preferences = preferences;
  }

  @InjectedFieldSignature("org.owntracks.android.services.BackgroundService.eventBus")
  public static void injectEventBus(BackgroundService instance, EventBus eventBus) {
    instance.eventBus = eventBus;
  }

  @InjectedFieldSignature("org.owntracks.android.services.BackgroundService.scheduler")
  public static void injectScheduler(BackgroundService instance, Scheduler scheduler) {
    instance.scheduler = scheduler;
  }

  @InjectedFieldSignature("org.owntracks.android.services.BackgroundService.locationProcessor")
  public static void injectLocationProcessor(BackgroundService instance,
      LocationProcessor locationProcessor) {
    instance.locationProcessor = locationProcessor;
  }

  @InjectedFieldSignature("org.owntracks.android.services.BackgroundService.geocoderProvider")
  public static void injectGeocoderProvider(BackgroundService instance,
      GeocoderProvider geocoderProvider) {
    instance.geocoderProvider = geocoderProvider;
  }

  @InjectedFieldSignature("org.owntracks.android.services.BackgroundService.contactsRepo")
  public static void injectContactsRepo(BackgroundService instance, ContactsRepo contactsRepo) {
    instance.contactsRepo = contactsRepo;
  }

  @InjectedFieldSignature("org.owntracks.android.services.BackgroundService.locationRepo")
  public static void injectLocationRepo(BackgroundService instance, LocationRepo locationRepo) {
    instance.locationRepo = locationRepo;
  }

  @InjectedFieldSignature("org.owntracks.android.services.BackgroundService.runThingsOnOtherThreads")
  public static void injectRunThingsOnOtherThreads(BackgroundService instance,
      RunThingsOnOtherThreads runThingsOnOtherThreads) {
    instance.runThingsOnOtherThreads = runThingsOnOtherThreads;
  }

  @InjectedFieldSignature("org.owntracks.android.services.BackgroundService.waypointsRepo")
  public static void injectWaypointsRepo(BackgroundService instance, WaypointsRepo waypointsRepo) {
    instance.waypointsRepo = waypointsRepo;
  }

  @InjectedFieldSignature("org.owntracks.android.services.BackgroundService.serviceBridge")
  public static void injectServiceBridge(BackgroundService instance, ServiceBridge serviceBridge) {
    instance.serviceBridge = serviceBridge;
  }
}
