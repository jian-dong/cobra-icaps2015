package cz.agents.deconfliction.vis;import java.awt.BasicStroke;import java.awt.Color;import java.awt.Graphics2D;import cz.agents.alite.vis.Vis;import cz.agents.alite.vis.layer.AbstractLayer;import cz.agents.alite.vis.layer.VisLayer;import cz.agents.alite.vis.layer.toggle.KeyToggleLayer;import cz.agents.alite.trajectorytools.util.Waypoint;import cz.agents.deconfliction.waypointgraph.DefaultWaypointGraph;public class CoordinateAxesLayer extends AbstractLayer {    protected DefaultWaypointGraph waypoints;    protected int strokeWidth;    protected Color color;    int maxx = 1000;    int maxy = 1000;    CoordinateAxesLayer(Color color, int strokeWidth) {        this.color = color;        this.strokeWidth = strokeWidth;    }    @Override    public void paint(Graphics2D canvas) {        canvas.setStroke(new BasicStroke(strokeWidth));        canvas.setColor(color);        canvas.drawLine(Vis.transX(0), Vis.transY(0), Vis.transX(1000), Vis.transY(0));        canvas.drawString("x", Vis.transX(1000), Vis.transY(-10));        canvas.drawLine(Vis.transX(0), Vis.transY(0), Vis.transX(0), Vis.transY(1000));        canvas.drawString("y", Vis.transX(-10), Vis.transY(1000));        canvas.drawString("0", Vis.transX(-10), Vis.transY(-10));    }    @Override    public String getLayerDescription() {        String description = "Layer shows coordinate axes.";        return buildLayersDescription(description);    }    public static VisLayer create(Color color, int strokeWidth, String toggleKey) {        KeyToggleLayer toggle = KeyToggleLayer.create(toggleKey);        toggle.addSubLayer(new CoordinateAxesLayer(color, strokeWidth));        toggle.setEnabled(false);        return toggle;    }}