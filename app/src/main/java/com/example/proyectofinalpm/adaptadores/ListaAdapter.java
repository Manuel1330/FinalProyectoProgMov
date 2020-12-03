package com.example.proyectofinalpm.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.proyectofinalpm.R;
import com.example.proyectofinalpm.entidades.Exposiciones;
import java.util.ArrayList;

public class ListaAdapter extends RecyclerView.Adapter<ListaAdapter.ExposicionesViewHolder> {

    ArrayList<Exposiciones> listaExposiciones;

    public ListaAdapter(ArrayList<Exposiciones> listaExposiciones) {
        this.listaExposiciones = listaExposiciones;
    }

    @Override
    public ExposicionesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_recyclerview,null,false);
        return new ExposicionesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ExposicionesViewHolder holder, int position) {
        holder.IdExposicion.setText(listaExposiciones.get(position).getIdExposicion().toString());
        holder.NombreExp.setText(listaExposiciones.get(position).getNombreExp());
        holder.Descripcion.setText(listaExposiciones.get(position).getDescripcion());
        holder.FechaInicio.setText(listaExposiciones.get(position).getFechaInicio().toString());
        holder.FechaFin.setText(listaExposiciones.get(position).getFechaFin().toString());
    }

    @Override
    public int getItemCount() {
        return listaExposiciones.size();
    }

    public class ExposicionesViewHolder extends RecyclerView.ViewHolder {

        TextView IdExposicion,NombreExp,Descripcion, FechaInicio, FechaFin;

        public ExposicionesViewHolder(View itemView) {
            super(itemView);
            IdExposicion = (TextView) itemView.findViewById(R.id.textIdExposicion);
            NombreExp = (TextView) itemView.findViewById(R.id.textNombreExp);
            Descripcion = (TextView) itemView.findViewById(R.id.textDescripcion);
            FechaInicio = (TextView) itemView.findViewById(R.id.textFechaInicio);
            FechaFin = (TextView) itemView.findViewById(R.id.textFechaFin);
        }
    }
}
