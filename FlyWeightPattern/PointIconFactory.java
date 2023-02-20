package FlyWeightPattern;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
    private Map<PointType, PointIcon> icons = new HashMap<>();
    public PointIcon getPointIcon(PointType type) {
        //key -> value
        //PointType -> PointIcon
        if (!icons.containsKey(type)) {
            var icon = new PointIcon(type, null); // real app use hospital.jpg file
            icons.put(type, icon);
        }

        return icons.get(type);
    }
}
