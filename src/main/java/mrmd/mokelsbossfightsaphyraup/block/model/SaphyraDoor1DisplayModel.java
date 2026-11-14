package mrmd.mokelsbossfightsaphyraup.block.model;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;

import mrmd.mokelsbossfightsaphyraup.block.display.SaphyraDoor1DisplayItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SaphyraDoor1DisplayModel extends GeoModel<SaphyraDoor1DisplayItem> {
   public ResourceLocation getAnimationResource(SaphyraDoor1DisplayItem animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "animations/bossgate.animation.json");
   }

   public ResourceLocation getModelResource(SaphyraDoor1DisplayItem animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "geo/bossgate.geo.json");
   }

   public ResourceLocation getTextureResource(SaphyraDoor1DisplayItem entity) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "textures/block/bossgatetexturesaphyra.png");
   }
}
