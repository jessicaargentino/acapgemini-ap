package modulo02.aula32.controller;

import java.util.ArrayList;

import modulo02.aula32.model.Product;

public class ProductController extends BaseController<Product> {
    /**
     * Método que percorre o ArrayList afim de verificar se existe objeto com o id
     * informado. Se sim, retorna o index/posição onde o objeto foi encontrado, se
     * não, retorna -1.
     * 
     * @param id id informado pelo usuário
     * @return >= 0 para encontrado, -1 para não encontrado
     */
    public int indexOf(int id) {
        ArrayList<Product> product = this.read();
        for (int i = 0; i < product.size(); i++) {
            Product p = product.get(i);
            if (p.getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
