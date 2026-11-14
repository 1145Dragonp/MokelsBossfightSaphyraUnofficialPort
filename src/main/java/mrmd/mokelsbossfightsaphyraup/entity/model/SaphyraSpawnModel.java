package mrmd.mokelsbossfightsaphyraup.entity.model;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;

import mrmd.mokelsbossfightsaphyraup.entity.SaphyraSpawnEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SaphyraSpawnModel extends GeoModel<SaphyraSpawnEntity> {
   public ResourceLocation getAnimationResource(SaphyraSpawnEntity entity) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "animations/moonbeam.animation.json");
   }

   public ResourceLocation getModelResource(SaphyraSpawnEntity entity) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "geo/moonbeam.geo.json");
   }

   public ResourceLocation getTextureResource(SaphyraSpawnEntity entity) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "textures/entities/" + entity.getTexture() + ".png");
   }
}
