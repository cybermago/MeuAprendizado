(g => {
    var h, a, k, p = "The Google Maps JavaScript API",
    c = "google",
    l = "importLibrary",
    q = "__ib__",
    m = document,
    b = window;
    b = b[c] || (b[c] = {});
    var d = b.maps || (b.maps = {}),
    r = new Set,
    e = new URLSearchParams,
    u = () => h || (h = new Promise(async (f, n) => {
    await (a = m.createElement("script"));
    e.set("libraries", [...r] + "");
    for (k in g) e.set(k.replace(/[A-Z]/g, t => "_" + t[0].toLowerCase()), g[k]);
    e.set("callback", c + ".maps." + q);
    a.src = `https://maps.${c}apis.com/maps/api/js?` + e;
    d[q] = f;
    a.onerror = () => h = n(Error(p + " could not load."));
    a.nonce = m.querySelector("script[nonce]")?.nonce || "";
    m.head.append(a)
    }));
    d[l] ? console.warn(p + " only loads once. Ignoring:", g) : d[l] = (f, ...n) => r.add(f) && u().then(() => d[l](f, ...n))
    })({
    key: "AIzaSyDHPNQxozOzQSZ-djvWGOBUsHkBUoT_qH4",
    v: "weekly",
    });



    async function initMap() {
        const { Map } = await google.maps.importLibrary("maps");
        const { AdvancedMarkerElement } = await google.maps.importLibrary("marker");
        const map = new Map(document.getElementById("map"), {
        center: { lat: 37.39094933041195, lng: -122.02503913145092 },
        zoom: 14,
        mapId: "4504f8b37365c3d0",
        });
        
        const draggableMarker = new AdvancedMarkerElement({
        map,
        position: { lat: 37.39094933041195, lng: -122.02503913145092 },
        gmpDraggable: true,
        title: "This marker is draggable. Click to remove.",
        });
        
        draggableMarker.addListener("click", (event) => {
        // Remove AdvancedMarkerElement from Map
        draggableMarker.map = null;
        });
        map.addListener("click", (event) => {
        // Set AdvancedMarkerView position and add to Map
        draggableMarker.position = event.latLng;
        draggableMarker.map = map;
        });
        }
        
        initMap();


        window.onload = function(){
            var map;

            function initialize(){
                var mapProp = {
                    center: new google.maps.latLng();
                    scrollWheel: false,
                    zoom: 12,
                    MapTypeId:google.maps.MapTypeId.ROADMAP
                }
                map = new google.maps.Map(document.getElementById("mapa"),mapProp);

                function addMarker(lat,long,content){
                    varlatLng = {'lat':lat,'long':long};

                    var marker = new google.maps.Marker({
                        position: latLng,
                        map: map,
                        title: content
                        icon:icon
                    });
                    var infoWindow = new google.maps.infoWindow({
                        content:content,
                        marker:marker,
                        maxWidth:200,
                        pixelOffset: new google.maps.Size(0,20)
                        
                    });
                    infoWindow.open(map,marker);
                }
            }
            initialize();
            var conteudo = '<p style="color:black;font-size:13px;padding:10px 0;"></p>'
            addMarker(-48.618967,-71.63787293,'','my-adress');

            function animal(){
                this.nome = 'cachorro';
                this.peso = '24kg';
            }
            var meuAnimal = new animal();
            alert(meuAnimal.nome);
        }