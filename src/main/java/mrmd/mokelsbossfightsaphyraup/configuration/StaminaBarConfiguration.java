package mrmd.mokelsbossfightsaphyraup.configuration;

import net.neoforged.neoforge.common.ModConfigSpec;
import net.neoforged.neoforge.common.ModConfigSpec.Builder;
import net.neoforged.neoforge.common.ModConfigSpec.ConfigValue;

public class StaminaBarConfiguration {
   public static final Builder BUILDER = new Builder();
   public static final ConfigValue<Boolean> STAMINABAR = BUILDER.comment("Stamina Bar Config").define("Enable Stamina Bar", true);
   public static final ModConfigSpec SPEC = BUILDER.build();

   static {
      BUILDER.push("Stamina Bar Config");
      BUILDER.pop();
   }
}
