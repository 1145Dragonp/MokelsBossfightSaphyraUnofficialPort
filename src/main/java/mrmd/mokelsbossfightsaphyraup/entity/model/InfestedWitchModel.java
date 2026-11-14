package mrmd.mokelsbossfightsaphyraup.entity.model;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;

import mrmd.mokelsbossfightsaphyraup.entity.InfestedWitchEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class InfestedWitchModel extends GeoModel<InfestedWitchEntity> {
   public ResourceLocation getAnimationResource(InfestedWitchEntity entity) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "animations/scream.animation.json");
   }

   public ResourceLocation getModelResource(InfestedWitchEntity entity) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "geo/scream.geo.json");
   }

   public ResourceLocation getTextureResource(InfestedWitchEntity entity) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "textures/entities/" + entity.getTexture() + ".png");
   }
}
