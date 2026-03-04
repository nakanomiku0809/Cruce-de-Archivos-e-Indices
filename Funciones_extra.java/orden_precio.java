public static void orden_precio(List<pedido> pedidos) {
    int i, j;
    for (i = 1; i < pedidos.size() - 1; i++) {
        for (j = 1; j < pedidos.size() - 1-i; j++) {
            if (pedidos.get(j).getPrecio() > pedidos.get(j + 1).getPrecio()) {
                pedidos temp = pedidos.get(j).getPrecio();
                pedidos.get(j).setPrecio(pedidos.get(j + 1).getPrecio());
                pedidos.get(j + 1).setPrecio(temp);
            }
        }
    }
    System.out.println("Ahora ordenado:");
    for (j = 1; j < pedidos.size(); j++) {
        System.out.println(pedidos.get(j));
    }
}