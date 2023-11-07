package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class UnlimitedVoidMobOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 10, 6, 6, 6, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.ENCHANT, x, y, z, 3, 6, 6, 6, 0);
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity instanceof TamableAnimal _tamIsTamedBy && entityiterator instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
					if (entityiterator instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(
								"GalaxyBeethovenRevolutionaryInventionSolarEclipseLeonardoDaVinciWaterfallAncientCivilizationsAmazonRainforestMicroorganismsRenaissanceArtifactsIsaacNewtonJellyfishAncientGreeceElectricityVeniceCanalsHumanGenomeEinstein'sTheoryMachuPicchuCellularRespirationVolcanoFormationApolloMissionMonaLisaAstronomyBlackHolesVinylRecordsGreatWallOfChinaPhotosynthesisTropicalRainforestsVincentVanGoghDinosaurExtinctionArchaeologicalDiscoveriesGeneticEngineeringFibonacciSequenceWorldWarIIAlbertEinsteinFossilRecordSpaceExplorationHieroglyphicsComputerProgrammingOceanCurrentsGreatPyramidOfGizaOpticalIllusionsMarieCuriePolarIceCapsVincentVanGoghDNAReplicationSurrealismArtMoaiStatuesGalapagosIslandsTheoryOfRelativityLeonardoDaVinciRenaissanceArchitectureMicrobiologySistineChapelCeilingNeolithicRevolutionEdgarAllanPoeAmphibianSpeciesPlateTectonicsImperialChinaHistoricalDocumentsRenewableEnergyPlantPhotosynthesisFermiParadoxRomeoAndJulietHubbleSpaceTelescopeGutenbergPrintingPressHimalayanMountainsExtinctSpeciesLeonardoDaVinci'sInventionsAncientEgyptianPharaohsMesopotamianCivilizationStringTheoryHumanAnatomyCharlesDarwin'sTheoryOfEvolutionMonaLisaMasterpieceGlobalWarmingAncientGreekPhilosophyAncientMayanCivilizationGreatBarrierReefMedievalCastlesVanishingSpeciesSolarSystemEcosystemsMarsExplorationDNASequencingPabloPicassoArtworksAmazonRiverNatureReservesRenewableEnergySourcesAlchemyAlchemyRainbowFormationNeptune'sAtmosphereAbrahamLincolnEmancipationProclamationHumanRightsSuffrageMovementMountEverestTectonicPlatesTheodoreRooseveltNationalParksMayanCalendarClaudeMonetImpressionistArtIslamicGoldenAgeArchimedes'PrinciplesIncaEmpireGeothermalEnergyCharlesDickensNovelsExtinctionEventsSaharaDesertHistoricalRevolutionsDaVinci'sSketchesSpaceTravelSustainableAgricultureSculptureTechniquesMagneticFieldsHumanAnatomyHeritageSitesAncientCivilizationsRomeoAndJulietMasterpiecePharaohsVincentVanGoghImpressionistArtEcosystemsMedievalCastlesAbrahamLincolnSuffrageMovementPolarIceCapsOpticalIllusionsRainbowFormationPabloPicassoArtworksEinstein'sTheoryRainforestGalaxyLeonardoDaVinci'sInventionsSolarEclipseHieroglyphicsMachuPicchuGeneticEngineeringRenaissanceArtifactsExtinctSpeciesMarsExplorationVinylRecordsImperialChinaComputerProgrammingVincentVanGoghDNAReplicationSurrealismArtOceanCurrentsVanishingSpeciesArchaeologicalDiscoveriesSistineChapelCeilingMicrobiologyPlateTectonicsSustainableAgricultureHumanAnatomyMonaLisaGreatWallOfChinaCharlesDarwin'sTheoryOfEvolutionExtinctionEventsHimalayanMountainsStringTheoryFossilRecordGalapagosIslandsPlateTectonicsHubbleSpaceTelescopeBlackHolesDinosaurExtinctionSaharaDesertAncientGreekPhilosophyNeolithicRevolutionVanishingSpeciesAncientEgyptianPharaohsLeonardoDaVinciRenaissanceArchitectureMonaLisaMasterpieceAbrahamLincolnEmancipationProclamationFermiParadoxGeneticEngineeringRainforestCharlesDickensNovelsTheodoreRooseveltNationalParksPolarIceCapsSolarSystemMarsExplorationMagneticFieldsClaudeMonetImpressionistArtIslamicGoldenAgeRainbowFormationAlchemyAlchemyExtinctSpeciesHeritageSitesArchimedes'PrinciplesRomeoAndJulietGreatBarrierReefHumanRightsAncientMayanCivilizationAncientCivilizationsDNASequencingPabloPicassoArtworksVanishingSpeciesSaharaDesertAncientGreekPhilosophyMedievalCastlesRainbowFormationAmazonRiverPhotosynthesisMonaLisaExtinctSpeciesHieroglyphicsComputerProgrammingPlateTectonicsMachuPicchuGeneticEngineeringRenaissanceArtifactsSistineChapelCeilingMicrobiologySaharaDesertVinylRecordsMagneticFieldsLeonardoDaVinciRenaissanceArchitectureSurrealismArtImperialChinaGalapagosIslandsPlateTectonicsSolarSystemEinstein'sTheoryArchimedes'PrinciplesPolarIceCapsTheodoreRooseveltNationalParksRainforestSaharaDesertHieroglyphicsFermiParadoxClaudeMonetImpressionistArtPabloPicassoArtworksAbrahamLincolnEmancipationProclamationRainbowFormationGeneticEngineeringExtinctSpeciesVanishingSpeciesMedievalCastlesVanishingSpeciesArchaeologicalDiscoveriesSustainableAgricultureSistineChapelCeilingMonaLisaSolarEclipseMicrobiologyGalaxyAncientCivilizationsLeonardoDaVinci'sInventionsPharaohsRomeoAndJulietMasterpieceRainbowFormationMarsExplorationLeonardoDaVinciRenaissanceArchitectureAncientMayanCivilizationPolarIceCapsCharlesDarwin'sTheoryOfEvolutionExtinctSpeciesMagneticFieldsHeritageSitesAncientGreekPhilosophyRainforestRenaissanceArtifactsSurrealismArtDNASequencingGreatBarrierReefIslamicGoldenAgeAlchemySaharaDesertExtinctionEventsHieroglyphicsFossilRecordVanishingSpeciesFermiParadoxPlateTectonicsGeneticEngineeringRainbowFormationComputerProgrammingLeonardoDaVinci'sInventionsMedievalCastlesSistineChapelCeilingVanishingSpeciesMachuPicchuArchimedes'PrinciplesAmazonRiverVinylRecordsAncientEgyptianPharaohsPlateTectonicsCharlesDickensNovelsPolarIceCapsSolarSystemImperialChinaGutenbergPrintingPressPhotosynthesisMonaLisaEcosystemsMayanCalendarAbrahamLincolnExtinctSpeciesVanishingSpeciesPlateTectonicsTheodoreRooseveltNationalParksRainforestPabloPicassoArtworksGeneticEngineeringClaudeMonetImpressionistArtHieroglyphicsSaharaDesertSurrealismArtFermiParadoxRainbowFormationSistineChapelCeilingGreatWallOfChinaAncientGreekPhilosophyGalaxyDNASequencingMagneticFieldsLeonardoDaVinciRenaissanceArchitectureExtinctSpeciesMedievalCastlesRainforestArchaeologicalDiscoveriesVanishingSpeciesSolarEclipsePolarIceCapsVanishingSpeciesGeneticEngineeringMonaLisaHieroglyphicsCharlesDarwin'sTheoryOfEvolutionRainbowFormationSaharaDesertMachuPicchuGreatBarrierReefFossilRecordImperialChinaEinstein'sTheoryGalapagosIslandsSustainableAgricultureHeritageSitesArchimedes'PrinciplesAncientMayanCivilizationPabloPicassoArtworksTheodoreRooseveltNationalParksGutenbergPrintingPressPhotosynthesisAbrahamLincolnExtinctSpeciesAncientCivilizationsSistineChapelCeilingAncientEgyptianPharaohsPlateTectonicsRainforestSurrealismArtVanishingSpeciesLeonardoDaVinci'sInventionsVanishingSpeciesSolarSystemRainbowFormationMagneticFieldsSaharaDesertDNASequencingClaudeMonetImpressionistArtPlateTectonicsSolarEclipseHieroglyphicsSustainableA"),
								false);
					if (entityiterator instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(
								"MinecraftsandboxvideogameloreCreepersiconicmobsexplosilentapproachEndermentalldarkteleportingwaterEnddimensionEnderDragonNetherFortressesstructureshellishBlazespawnersrodsWitherbosssummonedplayerssoulsandNetherStarBeaconVillagerspassivehumanoidprofessionsfarmersblacksmithslibrarianstradingenchantmentsgearexperiencepointsbookshelvesStrongholdshiddenstructuresOverworldEndPortalundergroundlibrariesenchantingbiomesvarietycharacteristicsresourcesforestsdesertsjunglestaigassnowytundrasoriginsMarkusPerssonacquiredMicrosoft2014worldwidephenomenonexplorebuildcreateSteveAlexdefaultplayercharacterskinsmusicdiscsdungeonsmineshaftsNetherUpdate2020addedbiomesblocksmobsenhancinggameplayEnderDragonfinalbossgrantsvaluablecraftingtableessentialitemstoolsweaponryexpandingevolvingupdatescontentimmersiveenjoy."),
								false);
					if (entityiterator instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7l Your mind is flooded with information.."), true);
					if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.DELETED_MOD_ELEMENT.get(), 100, 1, false, true));
				}
			}
		}
	}
}