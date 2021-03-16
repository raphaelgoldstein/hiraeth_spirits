package mc.thehealingangel.hiraeth_spirits;

import net.minecraftforge.common.config.Config;

@Config(modid = HiraethSpirits.MOD_ID)
public class Configurations
{
    @Config.Comment({
            "A number representing the corresponding Antlers model your player will use.",
            "0 means no model."
    })
    @Config.RangeInt(min = 0, max = 4)
    @Config.Name("Antlers model ID")
    public static int Antlers = 0;

    @Config.Comment({
            "A number representing the corresponding Horns model your player will use.",
            "0 means no model."
    })
    @Config.RangeInt(min = 0, max = 3)
    @Config.Name("Horns model ID")
    public static int Horns = 0;

    @Config.Comment({
            "A number representing the corresponding ears model your player will use.",
            "0 means no model."
    })
    @Config.RangeInt(min = 0, max = 2)
    @Config.Name("Ears model ID")
    public static int Ears = 0;

    @Config.Comment("A number representing the corresponding skin tone to use when rendering an ears model.")
    @Config.RangeInt(min = 0, max = 4)
    @Config.Name("Skin Tone ID")
    public static int SkinTone = 0;
}
