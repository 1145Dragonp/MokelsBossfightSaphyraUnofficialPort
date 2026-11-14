package mrmd.mokelsbossfightsaphyraup.entity.model;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;

import mrmd.mokelsbossfightsaphyraup.entity.NamelessSpawnEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class NamelessSpawnModel extends GeoModel<NamelessSpawnEntity> {
   public ResourceLocation getAnimationResource(NamelessSpawnEntity entity) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "animations/knightboss.animation.json");
   }

   public ResourceLocation getModelResource(NamelessSpawnEntity entity) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "geo/knightboss.geo.json");
   }

   public ResourceLocation getTextureResource(NamelessSpawnEntity entity) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "textures/entities/" + entity.getTexture() + ".png");
   }
}
