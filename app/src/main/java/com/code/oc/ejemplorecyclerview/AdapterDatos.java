package com.code.oc.ejemplorecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.security.AccessController;
import java.util.ArrayList;

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos> {


    ArrayList<String> listDatos;
    //generamos un constructor


    public AdapterDatos(ArrayList<String> listDatos) {
        this.listDatos = listDatos;
    }

    @NonNull
    @Override
    //este ViewHolder enlaza este mismo adaptador con el archivo itemlist
    public AdapterDatos.ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list,viewGroup,false);

        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDatos.ViewHolderDatos viewHolderDatos, int i) {
        viewHolderDatos.asignarDatos(listDatos.get(i));

    }

    @Override
    public int getItemCount() {
        return listDatos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {

        TextView dato;

        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            dato=itemView.findViewById(R.id.idDato);
        }

        public void asignarDatos(String datos) {
            dato.setText(datos);
        }
    }
}
