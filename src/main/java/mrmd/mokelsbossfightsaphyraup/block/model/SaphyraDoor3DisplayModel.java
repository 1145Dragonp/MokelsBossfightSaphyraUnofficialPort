package mrmd.mokelsbossfightsaphyraup.block.model;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;

import mrmd.mokelsbossfightsaphyraup.block.display.SaphyraDoor3DisplayItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SaphyraDoor3DisplayModel extends GeoModel<SaphyraDoor3DisplayItem> {
   public ResourceLocation getAnimationResource(SaphyraDoor3DisplayItem animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "animations/bossgateopen.animation.json");
   }

   public ResourceLocation getModelResource(SaphyraDoor3DisplayItem animatable) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "geo/bossgateopen.geo.json");
   }

   public ResourceLocation getTextureResource(SaphyraDoor3DisplayItem entity) {
      return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "textures/block/bossgatetexturesaphyra.png");
   }
}
